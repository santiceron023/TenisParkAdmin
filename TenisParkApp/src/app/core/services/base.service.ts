import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { map } from 'rxjs/operators';

export interface Options {
    headers?: HttpHeaders;
    params?: HttpParams;
}

export class BaseService {

    constructor(protected http: HttpClient) { }

    protected createDefaultOptions(): Options {
        return {
            headers: new HttpHeaders({ 'Content-Type': 'application/json' })
        };
    }

    protected optsName(name: string): Options {
        const newopts = this.createDefaultOptions();

        newopts.headers['xhr-name'] = name;

        return newopts;
    }

    protected optsNameCache(name: string): Options {
        const newopts = this.optsName(name);
        newopts.headers['xhr-plugin'] = 'pcache';
        return newopts;
    }

    protected createOptions(opts: Options): Options {
        const defaultOpts: Options = this.createDefaultOptions();

        if (opts) {
            opts = {
                params: opts.params || defaultOpts.params,
                headers: opts.headers || defaultOpts.headers
            };

            if (!opts.headers['Content-Type']) {
                opts.headers['Content-Type'] = defaultOpts.headers['Content-Type'];
            }
        }

        return opts || defaultOpts;
    }


    protected doGet<T>(serviceUrl: string, opts?: Options): Observable<T> {
        const ropts = this.createOptions(opts);

        return this.http.get(serviceUrl, ropts).pipe(
            map(response => response as T)
        );
    }

    protected doPost<T, R>(serviceUrl: string, body: T, opts?: Options): Observable<R> {
        const ropts = this.createOptions(opts);

        return this.http.post(serviceUrl, body, ropts).pipe(
            map(response => response as R)
        );
    }

    protected doGetParameters<T>(serviceUrl: string, parametros: URLSearchParams, opts?: Options): Observable<T> {
        const ropts = this.createOptions(opts);
        const options = parametros !== null ? {
            headers: ropts.headers,
            params: parametros
        } : ropts;

        return this.http.get(serviceUrl, ropts).pipe(
            map(response => response as T)
        );
    }
}
